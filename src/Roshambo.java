/**
 * Created by DELL on 7/25/2017.
 */


    public enum Roshambo {
        ROCK, PAPER, SCISSORS;


        public String toString() {
            switch (this){
                case ROCK:
                    return "Rock";
                case PAPER:
                    return "Paper";
                case SCISSORS:
                    return "Scissors";
            }
            return super.toString();
        }
    }

