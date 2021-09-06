using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace mr_FormulaBhaskara
{

    class Calculo
    {

        private double valorDeA;
        private double valorDeB;
        private double valorDeC;
        private double valorDeX1;
        private double valorDeX2;

        public Calculo() { }

        public Calculo(double valorDeA, double valorDeB, double valorDeC) {

            this.valorDeA = valorDeA;
            this.valorDeB = valorDeB;
            this.valorDeC = valorDeC;
        }

        public double calculoDelta()
        {
            double delta = (valorDeB * valorDeB) - (4 * valorDeA * valorDeC);
            double raiz = (Math.Pow(delta, 0.5));
            return raiz;

        }
        public String calcularRaiz1() {

            valorDeX1 = ((-1 * valorDeB) + calculoDelta()) / (2 * valorDeA);
            return valorDeX1.ToString("F");
        }

        public String calcularRaiz2(){

            valorDeX2 = ((-1 * valorDeB) - calculoDelta()) / (2 * valorDeA);
            return valorDeX2.ToString("F");
        }
    }
}
