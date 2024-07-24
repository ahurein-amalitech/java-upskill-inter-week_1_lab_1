public class ExceptionApp {
    public void throwCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("checked");
    }

    public void throwUncheckedExceptions(){
        throw new CustomUncheckedExceptions("unchecked");
    }

    public static void main(String[] args) {
        ExceptionApp app = new ExceptionApp();

        try {
            app.throwCheckedException();
        }catch (CustomCheckedException e){
            System.out.println(STR."Caught checked exception: \{e.getMessage()}");
        }

        try {
            app.throwUncheckedExceptions();
        }catch (CustomUncheckedExceptions e){
            System.out.println(STR."Caught unchecked exception: \{e.getMessage()}");
        }
    }
}
