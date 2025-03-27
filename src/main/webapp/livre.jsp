<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="ISO-8859-1">
    <title>Bibliothèque</title>
</head>
<body>
    <form action="LivreController" method="get">
        <h1>Enregistrement d'un livre</h1>

        <h2>Le livre</h2>
        <table>
            <tr>
                <td>Titre :</td>
                <td><input type="text" name="titre" required></td>
            </tr>
            <tr>
                <td>Catégorie :</td>
                <td>
                    <select name="categorie" required>
                        <option value="Roman">Roman</option>
                        <option value="Policier">Policier</option>
                        <option value="Junior">Junior</option>
                        <option value="Philosophie">Philosophie</option>
                        <option value="Sciences-fiction">Sciences-fiction</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Le numéro ISBN :</td>
                <td><input type="number" name="isbn" required></td>
            </tr>
        </table>

        <h2>L'auteur</h2>
        <table>
            <tr>
                <td>Nom :</td>
                <td><input type="text" name="nom" required></td>
            </tr>
            <tr>
                <td>Prénom :</td>
                <td><input type="text" name="prenom" required></td>
            </tr>
        </table>

        <br>
        <input type="submit" value="Valider">
    </form>
</body>
</html>
