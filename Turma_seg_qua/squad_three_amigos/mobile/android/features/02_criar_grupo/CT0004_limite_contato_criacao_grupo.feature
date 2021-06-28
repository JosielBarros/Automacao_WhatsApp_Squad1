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

    Cenario: Validar criar grupo com limite de contatos    

        Dado que tenho o "whatsApp instalado" no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou na "tela inical"
        E tenho pelo menos "256 contatos salvos" 

        Quando clico no "menu superir"
        E clico em "novo grupo"
        E seleciono os "256 contatos"
        E clico na "seta de prosseguir" 
        E adiciono o nome para o "Squad1_Teste" 
        E clico em "prosseguir"

        Então é exibido o grupo criado com nome "Squad1_Teste"



        