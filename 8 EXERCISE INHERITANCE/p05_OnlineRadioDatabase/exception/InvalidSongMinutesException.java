package p05_OnlineRadioDatabase.exception;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException(String message) {
        super(message);
    }
}
