package its_in_the_blood;

import its_in_the_blood.cells.Cell;
import its_in_the_blood.cells.bloodcells.BloodCell;
import its_in_the_blood.cells.bloodcells.RedBloodCell;
import its_in_the_blood.cells.bloodcells.WhiteBloodCell;
import its_in_the_blood.cells.microbes.Bacteria;
import its_in_the_blood.cells.microbes.Fungi;
import its_in_the_blood.cells.microbes.Virus;
import its_in_the_blood.clusters.Cluster;
import its_in_the_blood.organisms.Organism;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HealthManager {

    private Map<String, Organism> organismMap;

    public HealthManager() {
        this.organismMap = new LinkedHashMap<>();
    }

    public String checkCondition(String organismName) {
        if (this.organismMap.containsKey(organismName)) {
            return this.organismMap.get(organismName).toString();
        } else {
            return "";
        }
    }

    public String createOrganism(String name) {
        Organism organism = new Organism(name);
        if (!this.organismMap.containsKey(name)) {
            this.organismMap.put(name, organism);
            return String.format("Created organism %s", name);
        } else {
            return String.format("Organism %s already exists", name);
        }
    }

    public String addCluster(String organismName, String id, int rows, int cols) {
        Cluster cluster = new Cluster(id, rows, cols);
        if (this.organismMap.containsKey(organismName) && !this.organismMap.get(organismName).getClusters().containsKey(id)) {
            this.organismMap.get(organismName).addCluster(id, cluster);
            return String.format("Organism %s: Created cluster %s", organismName, id);
        }
        return "";
    }

    public String addCell(String organismName, String clusterId, String cellType, String cellId, int health, int positionX, int positionY, int additionalProperty) {
        if (!this.organismMap.containsKey(organismName) || !this.organismMap.get(organismName).getClusters().containsKey(clusterId)) {
            return "";
        } else {
            int clusterRow = this.organismMap.get(organismName).getClusters().get(clusterId).getRows();
            int clusterCol = this.organismMap.get(organismName).getClusters().get(clusterId).getCols();
            if ((positionX > clusterRow - 1 || positionX < 0) || (positionY > clusterCol - 1 || positionY < 0)) {
                return "";
            }
        }

        switch (cellType) {
            case "WhiteBloodCell":
                WhiteBloodCell whiteBloodCell = new WhiteBloodCell(cellId, health, positionX, positionY, additionalProperty);
                this.organismMap.get(organismName).getClusters().get(clusterId).addCell(whiteBloodCell);
                break;
            case "RedBloodCell":
                RedBloodCell redBloodCell = new RedBloodCell(cellId, health, positionX, positionY, additionalProperty);
                this.organismMap.get(organismName).getClusters().get(clusterId).addCell(redBloodCell);
                break;
            case "Bacteria":
                Bacteria bacteria = new Bacteria(cellId, health, positionX, positionY, additionalProperty);
                this.organismMap.get(organismName).getClusters().get(clusterId).addCell(bacteria);
                break;
            case "Virus":
                Virus virus = new Virus(cellId, health, positionX, positionY, additionalProperty);
                this.organismMap.get(organismName).getClusters().get(clusterId).addCell(virus);
                break;
            case "Fungi":
                Fungi fungi = new Fungi(cellId, health, positionX, positionY, additionalProperty);
                this.organismMap.get(organismName).getClusters().get(clusterId).addCell(fungi);
                break;
        }
        return String.format("Organism %s: Created cell %s in cluster %s",
                organismName, cellId, clusterId);
    }

    public String activateCluster(String organismName) {
        if (!this.organismMap.containsKey(organismName) || this.organismMap.get(organismName).getClusters().size() < 1) {
            return "";
        }

        String clusterName = "";

        try {
            for (Cluster cluster : this.organismMap.get(organismName).getClusters().values()) {
                clusterName = cluster.getId();
                Comparator<Cell> byRow = Comparator.comparing(Cell::getPositionX);
                Comparator<Cell> byCol = Comparator.comparing(Cell::getPositionY);
                List<Cell> sorted = cluster.getCells().stream()
                        .sorted(byRow.thenComparing(byCol))
                        .collect(Collectors.toList());

                for (int i = 1; i < sorted.size(); i++) {
                    if (sorted.get(0) instanceof BloodCell) {

                        sorted.get(0).setHealth(sorted.get(0).getHealth() + sorted.get(i).getHealth());
                        sorted.get(0).setPositionX(sorted.get(i).getPositionX());
                        sorted.get(0).setPositionY(sorted.get(i).getPositionY());
                    } else {

                        while (true) {
                            sorted.get(i).setHealth(sorted.get(i).getHealth() - sorted.get(0).calculateEnergy());
                            if (sorted.get(i).getHealth() <= 0) {
                                sorted.get(0).setPositionX(sorted.get(i).getPositionX());
                                sorted.get(0).setPositionY(sorted.get(i).getPositionY());
                                break;
                            }
                            sorted.get(0).setHealth(sorted.get(0).getHealth() - sorted.get(i).calculateEnergy());
                            if (sorted.get(0).getHealth() <= 0) {
                                sorted.set(0, sorted.get(i));
                                break;
                            }
                        }
                    }
                }
                cluster.getCells().clear();
                cluster.addCell(sorted.get(0));
                break;
            }
        } catch (Exception e) {
        }

        Cluster cluster = this.organismMap.get(organismName).getClusters().get(clusterName);
        this.organismMap.get(organismName).getClusters().remove(clusterName);
        this.organismMap.get(organismName).getClusters().putIfAbsent(clusterName, cluster);

        int size = cluster.getCells().size();

        return String.format("Organism %s: Activated cluster %s. Cells left: %d", organismName, cluster.getId(), size);
    }
}


























