public class Juror {

        private int number;
        private SkiJuror skiJuror;
        private double noteForJump;

        public Juror(int number, SkiJuror skiJuror) {
            this.number = number;
            this.skiJuror = skiJuror;
        }

        public Juror(int number, SkiJuror skiJuror, double noteForJump) {
            this.number = number;
            this.skiJuror = skiJuror;
            this.noteForJump = noteForJump;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public SkiJuror getSkiJuror() {
            return skiJuror;
        }

        public void setSkiJuror(SkiJuror skiJuror) {
            this.skiJuror = skiJuror;
        }

        public double getNoteForJump() {
            return noteForJump;
        }

        public double setNoteForJump(double noteForJump) {
            this.noteForJump = noteForJump;
            return noteForJump;
        }

        @Override
        public String toString() {
            return "Juror{" +
                    "number=" + number +
                    ", skiJuror=" + skiJuror +
                    '}';
        }
    }

