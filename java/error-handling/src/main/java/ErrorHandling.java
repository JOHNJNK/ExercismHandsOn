import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
       throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws IllegalAccessException{
        throw new IllegalAccessException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArithmeticException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new ArithmeticException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException{
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException{
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
       throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try{
            return Optional.of(new Integer(integer));
        }
        catch(Exception e){
            
        }
        return Optional.empty();
        
    }

}
