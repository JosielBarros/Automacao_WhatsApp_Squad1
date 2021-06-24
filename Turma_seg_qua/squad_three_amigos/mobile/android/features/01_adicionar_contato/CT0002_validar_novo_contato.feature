#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Yonara Brito
#version: 1.0

Funcionalidade: Adicionar contato no Whatsapp

        Como um usuário do whatsApp 
        quero salvar um novo contato
        para que eu posso te-lo na minha agenda

    CT_0002

    Cenário: Validar adição de "novo contato"

        Dado que tenho o "whatsApp instalado" no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou com uma "conversa aberta"
        E recebo um "novo contato"

        Quando clico em "adiconar contato"
        E insiro a informação nome "Yonara"
        E valido o número "+55 11 9999999"
        E clico em "salvar"

        Então é exibido a mensagem "contato salvo!"