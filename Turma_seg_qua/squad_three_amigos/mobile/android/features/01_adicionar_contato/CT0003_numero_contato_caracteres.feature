#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Yonara Brito
#version: 1.0

Funcionalidade: Adicionar contato no Whatsapp

        Como um usuário do whatsApp 
        quero preencher o campo número do contato
        para que eu possa salva-lo

    CT_0003

    Cenário: Verificar preenchimento de número de contato com "caracteres"

        Dado que tenho o "whatsApp instalado" no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou com uma "conversa aberta"
        E recebo um "novo contato"

        Quando clico em "adicionar contato"
        E tento adicionar caracteres no "campo de número"

        Então o sistema exibe somente "teclado númerico"