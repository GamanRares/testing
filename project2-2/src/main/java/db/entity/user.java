public class User implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_generator")
    @SequenceGenerator(name = "user_id_generator", sequenceName = "user_id_sequence")
    private Long id;

    @Size(min = 1, max = 100, message = "User email must be between 1 and 100 characters")
    @Column(name = "email", unique = true, length = 100, columnDefinition = "VARBINARY(255)")
    private String email;
  
}
