public class ConcatenateName {
    public static void main(String[] args) {
        // Full name split into an array
        String[] nameParts = {"Kaiza", "Mae", "M.", "Advincula"};
        String fullName = "";

        // Loop to concatenate the name parts
        for (int i = 0; i < nameParts.length; i++) {
            fullName += nameParts[i];

            // Add a space between words, but not after the last part
            if (i < nameParts.length - 1) {
                fullName += " ";
            }
        }

        // Output the full name
        System.out.println("Concatenated Full Name: " + fullName);
    }
}
