public class SkiJumper {

        private String firstName;
        private String lastName;

        private Service service = new Service();

        public SkiJumper(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            service.jumpAndGetScoreOfSingleJump();
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
                    '}';
        }
    }
