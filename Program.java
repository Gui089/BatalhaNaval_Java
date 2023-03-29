

public class Program {

    public static void main(String[] args){
        int numOfGuess =0;

        DotCom dot = new DotCom();

        GameHelper helper = new GameHelper();
        
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum +1, randomNum + 2};

        dot.setLocationsCelss(locations);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("Insira um número: ");

            String result = dot.checkYourself(guess);

            numOfGuess++;

            if(result.equals("kill")) {
                isAlive = false;


                System.out.println("Você usou " + numOfGuess +" Palpites");
            }
        }
    }
}