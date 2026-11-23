GERMAN -

Die Stickman Customization Anwendung ermöglicht es den Benutzern, ihren eigenen Stickman zu erstellen und zu personalisieren.
Man kann verschiedene Outfits (Hüte, Oberteile, Hosen & Schuhe) auswählen, einen Namen und einen Besitzer vergeben. Nach dem Erstellen kannst du deinen Stickman als PNG exportieren oder speichern und später anzeigen lassen. Dafür gibt es gibt es eine Filteroption, um Stickmans nach dem Besitzer zu suchen.

Features:

Personalisierung: Wähle Accessoires für deinen Stickman (Hut, Oberteil, Unterteil).

Name und Besitzer: Vergib einen Namen und einen Besitzer für deinen Stickman.

Random Name: Klicke auf einen Button, um einen zufälligen Namen zu generieren.

Speichern und Filtern: Speichere deine Stickmans in die Datenbank und filtere sie später nach dem Besitzer.



Nutzung der App: 

App starten:

Starte das Backend über https://webtechrepo.onrender.com (fährt durch Inaktivität herunter - hochfahren dauert ca. 1-2 Minuten). 

Öffne die Anwendung im Browser unter https://frontendstickman.onrender.com.

Stickman erstellen:

Vergib einen Namen für deinen Stickman.

Wähle Accessoires aus:

Hut: Wähle aus verschiedenen Hüten.

Oberteil: Entscheide dich für ein passendes Oberteil.

Unterteil: Wähle Hosen oder Schuhe aus.

Du kannst auch den "Random Name"-Button verwenden, um einen zufälligen Namen für deinen Stickman zu generieren.

Stickman speichern:

Sobald dein Stickman erstellt ist, kannst du ihn speichern. Der Stickman erhält automatisch den Namen und den Besitzer, den du angegeben hast.

Stickman anzeigen und filtern:

Im Homescreen kannst du zu "SHOW" navigieren. Hier kannst alle gespeicherten Stickmänner anzeigen und nach Besitzer filtern, um einen bestimmten Stickman zu finden.





ENGLISH ---------------------------------------------------------------------------------------------

The Stickman Customization Application enables Users to create and personalize their own Stickman.
It's possible to select various Outfits (Hats, Tops, Pants & Shoes), give a name to your Stickman and define a owner. After creating, you can export him as a PNG or save him and come back to him at some other time. Which you can do by 
making use of filteroption, to search for Stickmans by their owner. 

Features:

Customization: Choose accessories for your stickman (hat, top, bottom).

Name and Owner: Assign a name and an owner to your stickman.

Random Name: Click a button to generate a random name.

Save and Filter: Save your stickmen and filter them later by owner.



Using the App:

Start the App:

Start the backend via https://webtechrepo.onrender.com (it goes idle after inactivity – startup takes about 1-2 minutes).

Open the application in the browser at https://frontendstickman.onrender.com

Create a Stickman:

Give your stickman a name.

Choose accessories:

Hat: Choose from different hats.

Top: Pick a fitting top.

Bottom: Choose pants or shoes.

You can also use the "Random Name" button to generate a random name for your stickman.

Save a Stickman:

Once your stickman is created, you can save it. The stickman will automatically get the name and owner you provided.

Display and Filter Stickmen:

On the home screen, you can navigate to "SHOW". Here you can view all saved stickmen and filter them by owner to find a specific one.



DATENBANK (Neon, kostenlos & dauerhaft) ---------------------------------------------------------------

Die kostenlose Render-Postgres wird nach 30 Tagen gelöscht. Deshalb läuft die Datenbank bei Neon (Free Tier,
läuft nicht ab, 0,5 GB). Die Tabellen legt Spring automatisch an (`ddl-auto=update`).

Einrichtung (einmalig):

1. Auf https://neon.tech kostenlos registrieren und ein Projekt anlegen (Region z.B. "AWS Europe Central (Frankfurt)").
2. Im Dashboard auf "Connect" klicken, "Connection pooling" AUS lassen (direkte Verbindung, ohne `-pooler` im Host).
   Man bekommt etwas wie: `postgresql://neondb_owner:PASSWORT@ep-xxx.eu-central-1.aws.neon.tech/neondb?sslmode=require`
3. Bei Render im Backend-Service (webtechrepo) unter "Environment" setzen:
   - `JDBC_DATABASE_URL`      = `jdbc:postgresql://ep-xxx.eu-central-1.aws.neon.tech/neondb?sslmode=require`
     (Host + Datenbank aus Schritt 2, mit `jdbc:` davor, OHNE Benutzer/Passwort in der URL)
   - `JDBC_DATABASE_USERNAME` = `neondb_owner`
   - `JDBC_DATABASE_PASSWORD` = das Passwort aus Schritt 2
4. Speichern, Render deployt neu. Die alte Render-Datenbank kann gelöscht werden.

Hinweis: Neon pausiert die DB nach ca. 5 Minuten ohne Anfragen und weckt sie bei der nächsten Anfrage in
unter einer Sekunde wieder auf. Daten bleiben dabei erhalten.

