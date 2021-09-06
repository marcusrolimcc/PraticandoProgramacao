using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace mr_FormulaBhaskara
{
    public partial class Bhaskara : Form
    {
        public Bhaskara()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            Calculo calc = new Calculo(double.Parse(tbA.Text), double.Parse(tbB.Text), double.Parse(tbC.Text));
            lbX1.Text = calc.calcularRaiz1();
            lbX2.Text = calc.calcularRaiz2();
        }
    }
}
