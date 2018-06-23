package p05_OnlineRadioDatabase.exception;

public class InvalidSongException extends IllegalArgumentException {

    public InvalidSongException(String message){
        super(message);
    }
}
