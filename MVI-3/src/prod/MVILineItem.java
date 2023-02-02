package prod;

//public class LineSubstancesItem {
    public class MVILineItem {

        private String name;

        public MVILineItem(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "LineSubstancesItem{" + "name='" + name + '\'' + '}';
        }


    }

