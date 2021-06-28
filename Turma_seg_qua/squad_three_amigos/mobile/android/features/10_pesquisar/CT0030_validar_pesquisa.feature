#language: pt-br
#encoding: UTF-8
#date: 28/06/2021
#author: Josiel Júnior
#version: 1.0

Funcionalidade: Pesquisa do WhatsApp

        Como um usuário do whatsApp 
        quero preencher o campo nome do contato
        para que eu possa salva-lo  

    Contexto:

        Dado que tenho o whatsApp instalado no aparelho mobile e estou na tela inicial

    Esquema do cenario: Validar pesquisa da página principal do WhatsApp

        Quando clico na lupa de pesquisa
        E digito <busca>

        Então é exibido na tela <resultado> relacionado

        Exemplos:
          | busca     | resultado |
          | "1Yonara" | "1"       |
          | "1Eu"     | "Eu"      |
          | "Teste"   | "Tes"     |


