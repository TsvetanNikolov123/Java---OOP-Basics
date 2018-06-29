package p08_01_MilitaryElite.impl;

import p08_01_MilitaryElite.contracts.Mission;

public class MissionImpl implements Mission {

    public static final String IN_PROGRESS_MISSION_STATE = "inProgress";
    public static final String FINISHED_MISSION_STATE = "Finished";

    private String codeName;
    private String state;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    private void setState(String state) {
        if (!IN_PROGRESS_MISSION_STATE.equals(state) && !FINISHED_MISSION_STATE.equals(state)){
            throw new IllegalArgumentException();
        }

        this.state = state;
    }

    @Override
    public void completeMission(){
        this.state = FINISHED_MISSION_STATE;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.codeName, this.state);
    }
}
