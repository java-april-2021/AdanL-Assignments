public class Project {

        private String name;
        private String description;
        private int initialCost;
        private String defaultName ="this Project need a name";
        private String defaultDescription ="this Procject needs a description";
        private int defaultCost = 0;

        //contstructers
        public Project() {
            this.name = defaultName;
            this.description = defaultDescription;
            this.defaultCost= defaultCost;
        }
        public Project(String name) {
            this.name = name;
            this.description = defaultDescription;

        }
        public Project(String name, String description) {
            this.name = name;
            this.description =description;
            this.defaultCost= defaultCost;

        }
        public Project(String name, String description, int initialCost) {
            this.name = name;
            this.description =description;
            this.initialCost = initialCost;
        }
         //getters and setters
        public int getInitialCost() {
            return this.initialCost;
        }
        
        public String getName() {
            return this.name;
        }
        public String getDescription() {
            return this.description;
        }
        public void setInitialCost( int initialCost){
            this.initialCost = initialCost;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        
        private void name() {
            
        }
        //method
        public void elevatorPitch(){
            System.out.println(String.format("%s (%s) : %s", this.name, this.initialCost, this.description));
        }
        

}