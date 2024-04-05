package exception;

/**
 * Exception lever lorsque l'on souhaite supprimer une tache inexistante
 */
public class TacheNonPresenteException extends IllegalArgumentException {

	public TacheNonPresenteException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
