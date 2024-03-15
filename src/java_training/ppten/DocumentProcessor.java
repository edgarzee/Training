package java_training.ppten;

public class DocumentProcessor {
    public static void main (String[] args){
        String[] documentCodes = {"U1", "C2", "P3", "X4", "U5"};

        for (String code : documentCodes){
            try{
                processDocument(code);
                System.out.println("Document code processed successfully: " + code);
            } catch (InvalidDocumentCodeException e){
                System.out.println("Error processing document code: " + e.getMessage());
                System.out.println("Skipping invalid document code: " + code);
            }
        }
        System.out.println("All document codes processed.");
    }

    public static void processDocument(String code) throws InvalidDocumentCodeException{
        char firstChar = code.charAt(0);
        if (firstChar != 'U' && firstChar != 'C' && firstChar != 'P'){
            throw new InvalidDocumentCodeException("Invalid document code: " + code);
        }
        System.out.println("Process document code: " + code);
    }
}
