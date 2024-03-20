package br.com.pgabrelgmdeveloper.calculadoraimcjecpackcompose.Calculator

import java.text.DecimalFormat

class Calculator {
    companion object {
        fun CalculateIMC(altura: String, peso: String): String {
            val result: String
            val altura = altura.replace(",",".")
            val peso = peso.replace(",",".")

            val alturaD = altura.toDouble()
            val pesoD = peso.toDouble()

            val imc = pesoD / (alturaD * alturaD)
            val imcFormatter = DecimalFormat("0.00").format(imc)
            if (imc > 18.5) {
                result = "Abaixo do peso ideal !! IMC: $imcFormatter"
            }else if (imc in 18.5..25.0){
                result = "Peso Ideal !! IMC: $imcFormatter"
            } else if (imc in 25.0..30.00) {
                result = "Acima do peso Ideal !! IMC: $imcFormatter"
            } else if (imc in 30.0..40.0) {
                result = "Você já é Obeso !! IMC: $imcFormatter"
            }
            else {
                result = "Você já é Obeso até demais !! IMC: $imcFormatter"
            }


            return  result

        }
    }
}