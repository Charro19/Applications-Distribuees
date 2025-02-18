# Servlet Deployment Guide

## Prérequis
Avant de commencer, assurez-vous d'avoir les éléments suivants installés :
- [Apache Tomcat](https://tomcat.apache.org/download-90.cgi) ou [JBoss/WildFly](https://www.wildfly.org/downloads/)
- [IntelliJ IDEA Ultimate](https://www.jetbrains.com/idea/download/)
- JDK 8 ou supérieur

## Étapes d'installation et de déploiement

### 1. Téléchargez et installez le serveur Web
- Installez **Apache Tomcat** ou **JBoss/WildFly** en suivant la documentation officielle.
- Assurez-vous que le serveur est configuré et fonctionne correctement.

### 2. Implémentez une Servlet
- Dans IntelliJ IDEA Ultimate, créez un nouveau projet **Java Web**.
- Ajoutez une **Servlet** qui affiche un message personnalisé :
  ```java
  import java.io.IOException;
  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;

  @WebServlet("/hello")
  public class BonjourServlet extends HttpServlet {
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
          response.getWriter().println("<h1>Bonjour, [Votre Nom et Prénom]!</h1>");
      }
  }
