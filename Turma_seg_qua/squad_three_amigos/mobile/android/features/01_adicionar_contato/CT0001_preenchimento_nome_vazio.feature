#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Josiel Júnior
#version: 1.0

Funcionalidade: Adicionar contato no Whatsapp

    Como um usuário do whatsApp 
    quero preencher o campo nome do contato
    para que eu possa salva-lo  

CT_0001

    Cenário: Verificar preenchimento do "nome do contato"

        Dado que tenho o whatsApp instalado no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou com uma "conversa aberta"
        E recebo um "novo contato"

        Quando clico em "adiconar contato"
        E insiro a informação nome "Yonara"

        Então o nome do "contato é preenchido"