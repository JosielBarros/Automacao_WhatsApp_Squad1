#language: pt-br
#encoding: UTF-8
#date: 21/06/2021
#author: Josiel Júnior
#version: 1.0

Funcionalidade: Criar grupo no Whatsapp

        Como um usuário do whatsApp 
        quero criar um grupo
        para que eu possa me comunicar em comunidade

    CT_0005

    Cenário: Validar criar grupo "sem contato"

        Dado que tenho o "whatsApp instalado" no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou na "tela inical"

        Quando clico no "ícone de nova conversa"
        E clico em "novo grupo"
        E clico na "seta de prosseguir" 
        
        Então é exibido a mensagem "Pelo menos 1 contato deve ser selecionado"
        E continua "exibindo a mesma tela" 
        