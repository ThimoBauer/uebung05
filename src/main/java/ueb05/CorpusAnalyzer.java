package ueb05;

import java.util.*;

class CorpusAnalyzer {
	private List<String> theses;

	CorpusAnalyzer(Iterator<String> thesesIterator) {
		while(thesesIterator.hasNext()){
			theses.add(thesesIterator.next());
		}
	}


	int countTheses() {
		return theses.size(); 	//Gibt die Anzahl der angefertigten Theses zurück
	}


	int averageThesisTitleLength() {
		int average = 0;
		for (String s: theses)						//Gibt die durchschnittliche Länge von Titeln in Worten zurück
			average = average + s.split(" ").length;

		return average /theses.size();
		}
	}

	/**
	 * Gibt eine alphabetisch absteigend sortierte und duplikatfreie
	 * Liste der ersten Wörter der Titel zurück.
	 */
	List<String> uniqueFirstWords() {
		List<String> list = new LinkedList<>();
	}

	/**
	 * Gibt einen Iterator auf Titel zurück; dabei werden alle Woerter, welche
	 * in `blackList` vorkommen durch Sternchen ersetzt (so viele * wie Buchstaben).
	 */
	Iterator<String> censoredIterator(Set<String> blackList) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gibt eine Liste von allen Titeln zurueck, wobei Woerter so ersetzt werden,
	 * wie sie in der Map abgebildet werden.
	 */
	List<String> normalizedTheses(Map<String, String> replace) {
		throw new UnsupportedOperationException();
	}
}
