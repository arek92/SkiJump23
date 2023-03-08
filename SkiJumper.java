public class SkiJumper {

        private String firstName;
        private String lastName;

        private  final Service service = new Service();
        private double resultOfJump;

        public SkiJumper(String firstName, String lastName,double resultOfJump) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.resultOfJump = resultOfJump;

        }

    public SkiJumper() {
    }

    public double getResultOfJump() {
        return resultOfJump;
    }

    public void setResultOfJump(double resultOfJump) {
        this.resultOfJump = resultOfJump;
    }

    public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    @Override
    public String toString() {
        return "SkiJumper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", resultOfJump=" + resultOfJump +
                '}';
    }
}

