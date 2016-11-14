package nested_classes;
public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static String validatePhoneNumber(
            String phoneNumber1) {

        int numberLength = 10;

        class PhoneNumber {

            public static final String CONSTANT = "CONSTANT";
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

        }

        PhoneNumber myNumber = new PhoneNumber(phoneNumber1);
        return myNumber.getNumber();
    }

}