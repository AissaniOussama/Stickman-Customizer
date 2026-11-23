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



BACKEND & DATENBANK (Neon) ----------------------------------------------------------------------------

Backend und Datenbank laufen beide kostenlos bei Neon. Kein manuelles Hochfahren mehr: das Backend wacht beim
ersten Aufruf in Sekundenbruchteilen auf.

- Backend: Neon Function `stickman` (`functions/stickman/index.ts`, TypeScript + Hono + node-postgres)
  URL: https://br-twilight-base-bdscf6vp-stickman.compute.c-8.us-east-2.aws.neon.tech
  Endpunkte: `GET/POST /api/stickmans`, `GET /api/stickmans/{id}`, `GET /api/stickmans/owner/{owner}`
- Datenbank: Neon Postgres (Branch `production`), Tabelle `stickman` wird automatisch angelegt.
- Konfiguration: `neon.ts`. Deployen mit:

  ```
  npm install
  neon deploy --env .env.local
  ```

Das ursprüngliche Spring-Boot-Backend (`src/`, Java) ist noch im Repo (Webtech-Abgabe), wird aber nicht mehr
gehostet. Es läuft weiterhin lokal mit `DATABASE_URL_UNPOOLED` (Neon-URL) oder den `JDBC_DATABASE_*`-Variablen.
