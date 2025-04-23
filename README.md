# human-id-java
Human-Readable Identifiers for JAVA
JAVA ported version of https://github.com/RienNeVaPlus/human-id

> Using words to identify datasets (instead of numbers) provides various advantages when humans are involved, ie increased distinction and rememberability.

Human-ID generates readable strings by chaining common short words of the english language in a semi-meaningful way.
The result is concatenated of `adjective + noun + verb` resulting in a minimum ool size of **15 000 000** possible combinations.

- No dependencies

## Example Output

- HugeCoinsStare
- KhakiRiceCover
- SoftToysHear
- BraveHousesSee
- BluePantsDoubt
- SocialApplesWear
- MeanDollsBoil
- RedHandsBet


```java
import at.pichl.HumanId;

public static void main(String[] args) {
    System.out.println(HumanId.generate(new HumanId.Options()));
}
```

## Credits and references

1. Ported from https://github.com/RienNeVaPlus/human-id
