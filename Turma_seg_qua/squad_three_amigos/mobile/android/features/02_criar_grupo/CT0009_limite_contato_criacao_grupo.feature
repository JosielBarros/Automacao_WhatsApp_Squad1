#language: pt-br
#encoding: UTF-8
#date: 21/06/2021
#author: Josiel Júnior
#version: 1.0

Funcionalidade: Criar grupo no Whatsapp

        Como um usuário do whatsApp 
        quero criar um grupo
        para que eu possa me comunicar em comunidade

    CT_0004

    Contexto:

        Dado que tenho o whatsApp instalado no aparelho mobile
        E sou cadastrado no "whatsApp"
        E tenho pelo menos "257 contatos salvos" 
        E estou na "tela inicial"

    Esquema do Cenario: Validar criar grupo 

        Quando clico no "menu superir"
        E clico em "novo grupo"
        E seleciono <quantidade contato>
        E clico na "seta de prosseguir" 
        E "nomeio o grupo" 
        E clico em "prosseguir"

        Então é exibido o <resultado>

            Exemplos:
                |     quantidade contato    |               resultato              |
                |           "256"           |          "criado com sucesso"        |
                |           "257"           |      "limite de contato excedido"    |
        