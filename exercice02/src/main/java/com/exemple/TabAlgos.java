package com.exemple;

/**
 * Classe utilitaire pour les operations sur les tableaux.
 */
public final class TabAlgos {

  /**
   * Constructeur prive pour empecher l'instanciation.
   */
  private TabAlgos() {
    throw new UnsupportedOperationException("Classe utilitaire");
  }

  /**
   * Retourne le plus grand element d'un tableau.
   *
   * @param tab le tableau d'entiers
   * @return le plus grand element
   * @throws IllegalArgumentException si le tableau est null ou vide
   */
  public static int plusGrand(final int[] tab) {
    if (tab == null || tab.length == 0) {
      throw new IllegalArgumentException("Le tableau est null ou vide");
    }

    int max = tab[0];
    for (int i = 1; i < tab.length; i++) {
      if (tab[i] > max) {
        max = tab[i];
      }
    }
    return max;
  }

  /**
   * Calcule la moyenne des elements d'un tableau.
   *
   * @param tab le tableau d'entiers
   * @return la moyenne en double
   * @throws IllegalArgumentException si le tableau est null ou vide
   */
  public static double moyenne(final int[] tab) {
    if (tab == null || tab.length == 0) {
      throw new IllegalArgumentException("Le tableau est null ou vide");
    }

    long somme = 0L;
    for (int valeur : tab) {
      somme += valeur;
    }
    return (double) somme / tab.length;
  }

  /**
   * Verifie si deux tableaux sont egaux.
   *
   * @param tab1 le premier tableau
   * @param tab2 le second tableau
   * @return true si les tableaux sont egaux, false sinon
   */
  public static boolean egaux(final int[] tab1, final int[] tab2) {
    if (tab1 == null && tab2 == null) {
      return true;
    }
    if (tab1 == null || tab2 == null) {
      return false;
    }
    if (tab1.length != tab2.length) {
      return false;
    }
    for (int i = 0; i < tab1.length; i++) {
      if (tab1[i] != tab2[i]) {
        return false;
      }
    }
    return true;
  }
}