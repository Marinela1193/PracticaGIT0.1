using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TelegramaComandos
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            string textoTelegrama;
            char tipoTelegrama = ' ';
            int numPalabras = 0;
            double coste = 0;

            //Leo el telegrama 
            textoTelegrama = txtTelegrama.Text;
            // telegrama urgente?
            if (cbUrgente.Checked)
            {
                tipoTelegrama = 'u';
            }
            else
            {
                tipoTelegrama = 'o';
            }

            // Contar número de palabras
            numPalabras = textoTelegrama.Split(new char[] { ' ', '\t', '\n' }, StringSplitOptions.RemoveEmptyEntries).Length;

            // Calcular coste según el tipo de telegrama
            if (tipoTelegrama == 'o') // Ordinario
            {
                if (numPalabras <= 10)
                    coste = 25;
                else
                    coste = 25 + 0.5 * (numPalabras - 10); // Se suma a los 25 iniciales
            }
            else if (tipoTelegrama == 'u') // Urgente
            {
                if (numPalabras <= 10)
                    coste = 5;
                else
                    coste = 5 + 0.75 * (numPalabras - 10);
            }

            // Mostrar resultado
            txtPrecio.Text = coste.ToString("0.00") + " euros";
        }
    }
}
