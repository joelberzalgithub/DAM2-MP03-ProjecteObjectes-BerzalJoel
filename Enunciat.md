<div style="display: flex; width: 100%;">
    <div style="flex: 1; padding: 0px;">
        <p>© Albert Palacios Jiménez, 2023</p>
    </div>
    <div style="flex: 1; padding: 0px; text-align: right;">
        <img src="../../assets/ieti.png" height="32" alt="Logo de IETI" style="max-height: 32px;">
    </div>
</div>
<hr/>

### Enunciat:

Crea un sistema que permeti gestionar diferents tipus d'empleats en una empresa, practicant el casting ascendent i descendent d'objectes.

Imagina una empresa que té diversos tipus d'empleats, incloent Desenvolupadors i Gestors, que són especialitzacions de la classe Empleat.

Cada tipus d'empleat té atributs i mètodes específics.

Classe Base **Empleat**:

Atributs:
nom (String)
identificador (String)

Constructor que inicialitza els atributs.

Sobreescriure el mètode toString per mostrar una descripció bàsica de l'empleat, en aquest format:

"Empleat{nom='" + nom + "', identificador='" + identificador + "'}"

Subclasse **Desenvolupador**:

Atributs específics:
llenguatge (String) que indica el llenguatge de programació principal del desenvolupador.

Constructor que inicialitza els atributs (incloent els de la classe base).

Sobreescriure el mètode toString per mostrar una descripció bàsica del desenvolupador, en aquest format:

(El toString d'Empleat) + ", llenguatge='" + llenguatge + "'"

Subclasse **Gestor**:

Atributs específics:
departament (String) que indica el departament que gestiona.

Constructor que inicialitza els atributs (incloent els de la classe base).

Sobreescriure el mètode toString per mostrar una descripció bàsica del gestor, en aquest format:

(El toString d'Empleat) + ", departament='" + departament + "'"

### Requisits:

Utilitza el casting descendent per a convertir objectes de Empleat de nou a Desenvolupador o Gestor quan necessitis accedir a propietats o mètodes específics d'aquestes subclasses.

### Explicació:

Classe **Empleat**:

Conté els atributs nom i identificador.
Té un constructor que inicialitza aquests atributs.
Té el mètode toString que retorna una descripció bàsica de l'empleat.

Classe **Desenvolupador**:

Extén Empleat i afegeix l'atribut llenguatge.
Té un constructor que inicialitza els atributs, incloent els de la classe base.
Sobreescriu el mètode toString per afegir el llenguatge de programació.

Classe **Gestor**:

Extén Empleat i afegeix l'atribut departament.
Té un constructor que inicialitza els atributs, incloent els de la classe base.
Sobreescriu el mètode toString per afegir el departament.

Classe **Empresa**:

Crea un array d'empleats amb instàncies de Desenvolupador i Gestor.
Itera sobre els empleats i utilitza el càsting descendent per accedir a propietats específiques de Desenvolupador i Gestor.

### Tests:

Fes testos per validar el codi, fes servir l'Exercici08 de "06 Exercicis" com a exemple.

```bash
./runTest.sh com.project.TestMain#testMainOutput
./runTest.sh com.project.TestMain#testMainValidation
./runTest.sh com.project.TestMain#testMainPrivateAttributes
```
