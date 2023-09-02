import { StatusBar } from 'expo-status-bar';
import { ScrollView, StyleSheet, Text, View, Image } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>

     
     
      <ScrollView>
      <Image
      style={{
        width: "100%",
        height: 450,
        top: -20
      }}
      source={require('./img/demon.webp')}
      />
         <Text style={styles.titulo}>O Melhor App </Text>
         <Text style={styles.titulo}>sobre animes do mundo</Text>
      <StatusBar style="auto" />
      </ScrollView>
     
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0E273C',
   
  },

  titulo: {
    fontSize: 23,
    alignItems: 'center',
    justifyContent: 'center',
   
  },
});
