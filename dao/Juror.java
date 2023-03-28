package dao;

public class Juror {

        private int number;
        private SkiJuror skiJuror;
        private double noteForJump;

        public Juror(int number, SkiJuror skiJuror) {
            this.number = number;
            this.skiJuror = skiJuror;
        }


        public double setNoteForJump(double noteForJump) {
            this.noteForJump = noteForJump;
            return noteForJump;
        }

        @Override
        public String toString() {
            return "dao.Juror{" +
                    "number=" + number +
                    ", skiJuror=" + skiJuror +
                    '}';
        }
    }

