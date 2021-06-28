#language: pt-br
#encoding: UTF-8
#date: 28/06/2021
#author: Josiel Junior
#version: 1.0

Funcionalidade: Enviar mensagem

        Como um usuário do whatsApp 
        quero enviar mensagens
        para que possa comunicar-me com os contatos

    CT_0008

    Cenário: Validar envio de mensagem de texto

        Dado que tenho o "whatsApp instalado" no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou na "tela inicial"
        E tenho pelo menos "1 contato"

        Quando clico no "icone de nova conversa"
        E seleciono o contato "1Eu"
        E digito a mensagem "Olá, tudo bem?"
        E clico para "enviar"

        Então a "Olá, tudo bem?" é exibido no chat de conversa
