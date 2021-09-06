
namespace mr_FormulaBhaskara
{
    partial class Bhaskara
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblTitulo = new System.Windows.Forms.Label();
            this.btnCalcular = new System.Windows.Forms.Button();
            this.tbA = new System.Windows.Forms.TextBox();
            this.tbB = new System.Windows.Forms.TextBox();
            this.tbC = new System.Windows.Forms.TextBox();
            this.lbX1 = new System.Windows.Forms.Label();
            this.lbX2 = new System.Windows.Forms.Label();
            this.lbTituloA = new System.Windows.Forms.Label();
            this.lbTituloB = new System.Windows.Forms.Label();
            this.lbTituloC = new System.Windows.Forms.Label();
            this.lbTituloX1 = new System.Windows.Forms.Label();
            this.lbTituloX2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Orbitron", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.Location = new System.Drawing.Point(12, 19);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(336, 34);
            this.lblTitulo.TabIndex = 3;
            this.lblTitulo.Text = "Fórmula de Bhaskara";
            // 
            // btnCalcular
            // 
            this.btnCalcular.Font = new System.Drawing.Font("Orbitron", 18F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCalcular.Location = new System.Drawing.Point(12, 121);
            this.btnCalcular.Name = "btnCalcular";
            this.btnCalcular.Size = new System.Drawing.Size(336, 45);
            this.btnCalcular.TabIndex = 4;
            this.btnCalcular.Text = "Calcular";
            this.btnCalcular.UseVisualStyleBackColor = true;
            this.btnCalcular.Click += new System.EventHandler(this.btnCalcular_Click);
            // 
            // tbA
            // 
            this.tbA.Location = new System.Drawing.Point(12, 86);
            this.tbA.Name = "tbA";
            this.tbA.Size = new System.Drawing.Size(100, 20);
            this.tbA.TabIndex = 5;
            // 
            // tbB
            // 
            this.tbB.Location = new System.Drawing.Point(129, 86);
            this.tbB.Name = "tbB";
            this.tbB.Size = new System.Drawing.Size(100, 20);
            this.tbB.TabIndex = 6;
            // 
            // tbC
            // 
            this.tbC.Location = new System.Drawing.Point(248, 86);
            this.tbC.Name = "tbC";
            this.tbC.Size = new System.Drawing.Size(100, 20);
            this.tbC.TabIndex = 7;
            // 
            // lbX1
            // 
            this.lbX1.BackColor = System.Drawing.Color.White;
            this.lbX1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbX1.Location = new System.Drawing.Point(7, 205);
            this.lbX1.Name = "lbX1";
            this.lbX1.Size = new System.Drawing.Size(100, 39);
            this.lbX1.TabIndex = 8;
            this.lbX1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbX2
            // 
            this.lbX2.BackColor = System.Drawing.Color.White;
            this.lbX2.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbX2.Location = new System.Drawing.Point(248, 205);
            this.lbX2.Name = "lbX2";
            this.lbX2.Size = new System.Drawing.Size(100, 39);
            this.lbX2.TabIndex = 9;
            this.lbX2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbTituloA
            // 
            this.lbTituloA.AutoSize = true;
            this.lbTituloA.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTituloA.Location = new System.Drawing.Point(12, 63);
            this.lbTituloA.Name = "lbTituloA";
            this.lbTituloA.Size = new System.Drawing.Size(93, 20);
            this.lbTituloA.TabIndex = 10;
            this.lbTituloA.Text = "Valor de \"a\"";
            // 
            // lbTituloB
            // 
            this.lbTituloB.AutoSize = true;
            this.lbTituloB.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTituloB.Location = new System.Drawing.Point(125, 63);
            this.lbTituloB.Name = "lbTituloB";
            this.lbTituloB.Size = new System.Drawing.Size(93, 20);
            this.lbTituloB.TabIndex = 11;
            this.lbTituloB.Text = "Valor de \"b\"";
            // 
            // lbTituloC
            // 
            this.lbTituloC.AutoSize = true;
            this.lbTituloC.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTituloC.Location = new System.Drawing.Point(250, 63);
            this.lbTituloC.Name = "lbTituloC";
            this.lbTituloC.Size = new System.Drawing.Size(92, 20);
            this.lbTituloC.TabIndex = 12;
            this.lbTituloC.Text = "Valor de \"c\"";
            // 
            // lbTituloX1
            // 
            this.lbTituloX1.AutoSize = true;
            this.lbTituloX1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTituloX1.Location = new System.Drawing.Point(9, 182);
            this.lbTituloX1.Name = "lbTituloX1";
            this.lbTituloX1.Size = new System.Drawing.Size(92, 20);
            this.lbTituloX1.TabIndex = 13;
            this.lbTituloX1.Text = "Raiz 1 ( x1 )";
            // 
            // lbTituloX2
            // 
            this.lbTituloX2.AutoSize = true;
            this.lbTituloX2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lbTituloX2.Location = new System.Drawing.Point(250, 182);
            this.lbTituloX2.Name = "lbTituloX2";
            this.lbTituloX2.Size = new System.Drawing.Size(92, 20);
            this.lbTituloX2.TabIndex = 14;
            this.lbTituloX2.Text = "Raiz 2 ( x2 )";
            // 
            // Bhaskara
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(354, 258);
            this.Controls.Add(this.lbTituloX2);
            this.Controls.Add(this.lbTituloX1);
            this.Controls.Add(this.lbTituloC);
            this.Controls.Add(this.lbTituloB);
            this.Controls.Add(this.lbTituloA);
            this.Controls.Add(this.lbX2);
            this.Controls.Add(this.lbX1);
            this.Controls.Add(this.tbC);
            this.Controls.Add(this.tbB);
            this.Controls.Add(this.tbA);
            this.Controls.Add(this.btnCalcular);
            this.Controls.Add(this.lblTitulo);
            this.Name = "Bhaskara";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Button btnCalcular;
        private System.Windows.Forms.TextBox tbA;
        private System.Windows.Forms.TextBox tbB;
        private System.Windows.Forms.TextBox tbC;
        private System.Windows.Forms.Label lbX1;
        private System.Windows.Forms.Label lbX2;
        private System.Windows.Forms.Label lbTituloA;
        private System.Windows.Forms.Label lbTituloB;
        private System.Windows.Forms.Label lbTituloC;
        private System.Windows.Forms.Label lbTituloX1;
        private System.Windows.Forms.Label lbTituloX2;
    }
}