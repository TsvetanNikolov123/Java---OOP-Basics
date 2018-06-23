package p05_OnlineRadioDatabase.exception;

public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException(String message) {
        super(message);
    }
}
