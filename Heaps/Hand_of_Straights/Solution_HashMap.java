class Solution {
  public boolean isNStraightHand(int[] hand, int groupSize) {
    if (hand.length % groupSize != 0) {
      return false;
    }

    Map<Integer, Integer> map = new HashMap<>();
    Arrays.sort(hand);

    for (int card : hand) {
      map.put(card, map.getOrDefault(card, 0) + 1);
    }

    for (int card : hand) {
      if (map.get(card) > 0) {
        for (int i = 0; i < groupSize; i++) {
          int currentCard = card + i;
          if (map.getOrDefault(currentCard, 0) == 0) {
            return false;
          }
          map.put(currentCard, map.get(currentCard) - 1);
        }
      }
    }

    return true;
  }
}
