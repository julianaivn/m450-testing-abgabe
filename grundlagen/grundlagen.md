# Aufgabe 1: 
Welche Formen von Tests kennen Sie aus der Informatik?

### Unit-Test
- Testet eine einzelne Funktion/Klasse isoliert

wie:
- Testfälle definieren (Input → erwarteter Output)
- automatisiert mit Frameworks wie JUnit / Jest / pytest

### Integrationstest
Testet wie mehrere Komponenten zusammen funktionieren.

Wie:
- mehrere Module gemeinsam starten
- prüfen, ob Daten korrekt fliessen und Resultate stimmen

### End-to-End (E2E)
Testet das komplette System so, wie es der User nutzt

Wie:
- über UI/REST-API
- Tools: z.B. Selenium / Cypress / Playwright
- typische User-Flows nachspielen

# Aufgabe 2:
## Nennen Sie ein Beispiel eines SW-Fehlers und eines SW-Mangels.
### SW-Fehler:
Ein Fehler liegt vor, wenn eine Anforderung nicht erfüllt wird.

**Beispiel:**
Eine Wecker-App klingelt eine Stunde zu früh, obwohl die Uhrzeit korrekt eingestellt ist.

### SW-Mangel:
Ein Mangel liegt vor, wenn eine berechtigte Erwartung oder Anforderung nicht angemessen erfüllt wird,
obwohl die eigentliche Funktion korrekt arbeitet.

**Beispiel:**
Eine Rechner-app führt die rechnung korrekt aus, aber die zahl wird im GUI falsch dargestellt.

## Nennen Sie ein Beispiel für einen hohen Schaden bei einem SW-Fehler.
Eine medizinische Software berechnet die Dosierung eines Medikaments falsch.

**Anforderung:**
Die Software muss die korrekte Medikamentenmenge basierend auf Gewicht und Alter berechnen.

**Tatsächliches Verhalten:**
Aufgrund eines Rechenfehlers wird eine zu hohe Dosis ausgegeben.

**Folge:**
Patient:innen erleiden schwere gesundheitliche Schäden oder sterben.

# Aufgabe 3
[Code & Lösung](code)


Aufgabe 3 - Bonus
Das Programmstück ist fehlerhaft ;) Finden Sie den Fehler im Code. Was müsste man korrigieren?
