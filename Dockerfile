# USAGE:
# $ docker run \
#   --detach \
#   --volume /home/ubuntu/jailer_data:/root/jailer_data:rw \
#   bluerogue251/jailer:v5.3.1 \
#   ./jailer.sh  export /root/jailer_data/extraction_models/recombine/extraction_model.csv org.postgresql.Driver jdbc:postgresql://<DB_HOST>:<DB_PORT>/<DB_NAME> <DB_USER> <DB_PASSWORD> -jdbcjar lib/postgresql-9.1-901.jdbc4.jar -e /root/jailer_data/dump_output/dump.sql.zip -UTF8 -where "T.id in (40000, 33167, 37146, 5102, 44675, 20110, 25000, 27000, 10000, 1008,2456,2572,2563,2479,2656,2860,2854,2861,2640,2639,2857,2862,2567,2566,2565,2662,2587,3161,2655,2773,2641,2859,2864,2589,2583,2858,2650,2658,2646,2573,2434,1970,2922,3051,3213,3049,3053,3125,3128,2728,3163,2792,2967,2968,2965,2765,3129,2966,3263,3216,3130,12805,3052,3202,20110,3319,2996,3427,3318,3428,3621,3583,9772,3509,4224,3963,4015,4158,4263,6421,6416,6417,5548,5411,5671,5460,5459,2531,7946,6102,5458,3119,3188,3757,3897,3937,3940,5259,2959,13792,12,17303,16829,15728,15720,17296,15689,16821,18876)" -format SQL -scope SESSION_LOCAL -datamodel /root/jailer_data/datamodels/recombine

FROM java:8

WORKDIR /root
COPY ./ /root/jailer

RUN wget --output-document=/root/jailer/lib/postgresql-9.3-1104.jdbc41.jar https://jdbc.postgresql.org/download/postgresql-9.3-1104.jdbc41.jar

WORKDIR /root/jailer
