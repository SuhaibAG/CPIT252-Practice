public class Singleton {

        private static Singleton sSoleInstance;

        private Singleton(){}


        public static Singleton getInstance(){
            if(sSoleInstance == null){
                sSoleInstance = new Singleton();
            }

            return sSoleInstance;
        }
    }

