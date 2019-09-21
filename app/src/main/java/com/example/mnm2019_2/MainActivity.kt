package com.example.mnm2019_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var segredo:TextView = findViewById(R.id.primeirobotao)
        var quantidadedeerros:TextView = findViewById(R.id.quartobotao)
        var letra:EditText = findViewById(R.id.segundobotao)
        var reiniciar:Button = findViewById(R.id.terceirobotao)
        var botao:Button = findViewById(R.id.quintobotao)

        var palavras = listOf<String>("sabado", "chuva", "alegria")
        var erros = 0
        var acertos = mutableListOf<String>()
        var palavra = ""
        reiniciar.setOnClickListener{
             palavra = palavras.random()
            segredo.text = "_ ".repeat(palavra.count())

        }

        botao.setOnClickListener{
            var digito = letra.text.toString()
            var contemletra = palavra.indexOf(digito)
            if (contemletra > -1) {
                acertos.add(digito)

            }
            else {
                erros = erros +1
                quantidadedeerros.text = "erros $erros"
            }

            }


        }
    }



























//        var texto1:TextView = findViewById(R.id.primeirobotao)
//        texto1.text = "meutexto"
//        var texto2:TextView = findViewById(R.id.quartobotao)
//        var imput:TextView = findViewById(R.id.segundobotao)
//        var botao1:TextView = findViewById(R.id.terceirobotao)
//
//        var numero = 7
//        var divisao = numero/2
//        texto1.text = divisao.toString()
//
//        var meutexto = "meutexto"
//        texto1.text = meutexto.get(1).toString()
//
//        var a = 1
//        texto1.text = "o numero é igual a: " + a
//
//
//        botao1.setOnClickListener{
//
//            if (a.toString()==imput.text.toString())
//                texto2.text = "o numero é verdadeiro"
//            else
//                texto2.text = "o numero não é verdadeiro"
//
//          }
//      }
//  }

