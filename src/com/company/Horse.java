package com.company;

public class Horse{
        private String name;
        private int jashy;
        private double salmagy;

        //constructor
        public Horse(String name, int jashy, double salmagy) {
                this.name = name;
                this.jashy = jashy;
                this.salmagy = salmagy;
        }
        public Horse(){

        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getJashy() {
                return jashy;
        }

        public void setJashy(int jashy) {
                this.jashy = jashy;
        }

        public double getSalmagy() {
                return salmagy;
        }

        public void setSalmagy(double salmagy) {
                this.salmagy = salmagy;
        }
}
