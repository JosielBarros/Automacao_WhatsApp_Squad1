#language: pt-br
#encoding: UTF-8
#date: 21/06/2021
#author: Josiel Júnior
#version: 1.0

Funcionalidade: Criar grupo no Whatsapp

        Como um usuário do whatsApp 
        quero criar um grupo
        para que eu possa me comunicar em comunidade

    CT_0006

    Cenário: Validar criar grupo com "quantidade mínima" de contato

        Dado que tenho o "whatsApp instalado" no aparelho mobile
        E sou cadastrado no "whatsApp"
        E estou na "tela inical"
        E tenho pelo menos "1 contato salvo" 

        Quando clico no "ícone de nova conversa"
        E clico em "novo grupo"
        E seleciono "1 contato"
        E clico para "avançar"
        E adiciono nome para o grupo "Squad three amigos"
        E clico para "criar grupo"
        
        Então é exibido a tela com o novo grupo "Squad three amigos"
        