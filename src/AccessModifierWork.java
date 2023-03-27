public class AccessModifierWork {
        private double radius=1.0;
        private String color="red";
        public AccessModifierWork(){

        }
        public AccessModifierWork(double radius){
            this.radius=radius;
        }
        public double getRadius(){
            return radius;
        }
        public String getColor(){
            return color;
        }
}
