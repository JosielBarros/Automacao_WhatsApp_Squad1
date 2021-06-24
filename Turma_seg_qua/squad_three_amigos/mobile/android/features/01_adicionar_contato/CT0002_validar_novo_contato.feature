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
        E clico para entrar no "aplicativo"

        Quando clico no "icone de nova conversa"
        E clico em "novo contato"
        E insiro a informação nome "Josiel Teste"
        E insiro o número telefonico "11 9 00000000"
        E clico em "salvar"

        Então é exibido a mensagem "Contato salvo: Josiel Teste"