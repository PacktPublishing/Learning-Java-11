public class Education {
    private String subject;

    protected String getSubject() {
        return subject;
    }

    protected void setSubject(String subject) {
        this.subject = subject;
    }

    protected double calculateAverageGrade(double[] numbers) {
        double average = 0;
        // add all values up
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        // divide average by number of numbers
        return average / numbers.length;
    }
}
