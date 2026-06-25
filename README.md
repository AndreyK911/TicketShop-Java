<<<<<<< HEAD
# Ticketshop

# Ticket Shop

Ein konsolenbasiertes Java-Projekt, das ich während meines Praktikums bei GISA im Jahr 2025 entwickelt habe.

## Wie das Programm funktioniert

Das Programm wird komplett über die Konsole gesteuert. Nach dem Start öffnet sich ein Menü, in dem Aktionen durch die Eingabe von Zahlen ausgewählt werden.

1. Neues Event hinzufügen: Man wählt die Option 1 und gibt nacheinander Name, Ort, Datum und Ticketanzahl ein. Wichtig: Das Datum muss im Format YYYY-MM-DD eingegeben werden (z. B. 2026-10-15). Das Programm generiert daraufhin automatisch eine eindeutige ID, die auf einer Primzahl basiert.
2. Event bearbeiten: Man wählt Option 2, gibt die ID des Events ein und kann alle Daten überschreiben.
3. Event anzeigen oder löschen: Über die Optionen 3 und 5 kann ein bestimmtes Event anhand seiner ID gesucht oder aus dem System gelöscht werden.
4. Alle Events anzeigen: Option 4 listet alle aktuell gespeicherten Events auf.
5. Programm beenden: Die Eingabe der 0 schließt das Programm und schließt den Eingabestrom.

## Installation und Start

Um das Projekt lokal auszuführen, sind nur zwei Schritte erforderlich.

1. Das Repository klonen oder die .java Dateien in einen gemeinsamen Ordner (z. B. src) auf dem Computer herunterladen.
2. Die Datei Main.java in einer beliebigen IDE (wie IntelliJ IDEA, Eclipse) oder über das Terminal öffnen und ausführen. Für den Start über das Terminal nutzt man die Befehle javac Main.java und danach java Main.

## Warum der Code so aufgebaut ist

Ich wollte mit diesem Projekt nicht zeigen, dass ich ein Profi bin, sondern dass ich bereit bin, selbstständig zu lernen, Verantwortung für meine Entwicklung zu übernehmen und mich schnell in neue Technologien einzuarbeiten. 

Wenn ich mir den Code heute ansehe, fallen mir direkt Dinge auf, die ich jetzt anders lösen würde. Die Benutzereingaben über den Scanner sollten nicht direkt in den Service-Methoden wie addEvent() stecken, sondern sauber in eine eigene Controller-Schicht ausgelagert werden (Single-Responsibility-Prinzip). Auch Fehleingaben beim Datum würde ich heute eher mit Custom Exceptions statt mit einfachen try-catch-Blöcken abfangen. Ich habe die Struktur dennoch bewusst authentisch gelassen, um meinen realen Fortschritt zu zeigen.
=======
# TicketShop-Java
>>>>>>> f0558be65d2d95daec848ee893083f1bdceb972b
