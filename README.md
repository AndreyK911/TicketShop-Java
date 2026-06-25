# Ticket Shop

Ein konsolenbasiertes Java-Projekt, das ich während meines Praktikums bei GISA im Jahr 2025 entwickelt habe.

## Wie das Programm funktioniert

Das Programm wird komplett über die Konsole gesteuert. Nach dem Start öffnet sich ein Menü, in dem Aktionen durch die Eingabe von Zahlen ausgewählt werden.

1. Neues Event hinzufügen: Name, Ort, Datum und Ticketanzahl eingeben. Datum im Format YYYY-MM-DD (z. B. 2026-10-15). Das Programm generiert automatisch eine eindeutige ID basierend auf einer Primzahl.
2. Event bearbeiten: ID eingeben und alle Daten überschreiben.
3. Event anzeigen oder löschen: Über ID suchen oder aus dem System entfernen.
4. Alle Events anzeigen: Listet alle gespeicherten Events auf.
5. Programm beenden: Eingabe 0 schließt das Programm.

## Installation und Start

1. Repository klonen oder die .java Dateien in einen gemeinsamen Ordner herunterladen.
2. Main.java in einer IDE öffnen und ausführen, oder über Terminal: erst `javac Main.java`, dann `java Main`.

## Warum der Code so aufgebaut ist

Ich wollte mit diesem Projekt zeigen, dass ich bereit bin, selbstständig zu lernen und Verantwortung für meine Entwicklung zu übernehmen. Wenn ich mir den Code heute ansehe, würde ich einiges anders lösen — Benutzereingaben gehören nicht direkt in die Service-Methoden, sondern in eine eigene Controller-Schicht. Ich habe die Struktur dennoch bewusst authentisch gelassen, um meinen realen Fortschritt zu zeigen.
