// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package distributed.distributed

/** @param partitionStandard
  *   i th standard will be the i th partition
  */
@SerialVersionUID(0L)
final case class PartitionResponse(
    machineNumber: _root_.scala.Int = 0,
    partitionStandard: _root_.scala.Seq[_root_.com.google.protobuf.ByteString] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PartitionResponse] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = machineNumber
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      partitionStandard.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = machineNumber
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      partitionStandard.foreach { __v =>
        val __m = __v
        _output__.writeBytes(2, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def withMachineNumber(__v: _root_.scala.Int): PartitionResponse = copy(machineNumber = __v)
    def clearPartitionStandard = copy(partitionStandard = _root_.scala.Seq.empty)
    def addPartitionStandard(__vs: _root_.com.google.protobuf.ByteString *): PartitionResponse = addAllPartitionStandard(__vs)
    def addAllPartitionStandard(__vs: Iterable[_root_.com.google.protobuf.ByteString]): PartitionResponse = copy(partitionStandard = partitionStandard ++ __vs)
    def withPartitionStandard(__v: _root_.scala.Seq[_root_.com.google.protobuf.ByteString]): PartitionResponse = copy(partitionStandard = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = machineNumber
          if (__t != 0) __t else null
        }
        case 2 => partitionStandard
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(machineNumber)
        case 2 => _root_.scalapb.descriptors.PRepeated(partitionStandard.iterator.map(_root_.scalapb.descriptors.PByteString(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: distributed.distributed.PartitionResponse.type = distributed.distributed.PartitionResponse
    // @@protoc_insertion_point(GeneratedMessage[distributed.PartitionResponse])
}

object PartitionResponse extends scalapb.GeneratedMessageCompanion[distributed.distributed.PartitionResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[distributed.distributed.PartitionResponse] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): distributed.distributed.PartitionResponse = {
    var __machineNumber: _root_.scala.Int = 0
    val __partitionStandard: _root_.scala.collection.immutable.VectorBuilder[_root_.com.google.protobuf.ByteString] = new _root_.scala.collection.immutable.VectorBuilder[_root_.com.google.protobuf.ByteString]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __machineNumber = _input__.readInt32()
        case 18 =>
          __partitionStandard += _input__.readBytes()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    distributed.distributed.PartitionResponse(
        machineNumber = __machineNumber,
        partitionStandard = __partitionStandard.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[distributed.distributed.PartitionResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      distributed.distributed.PartitionResponse(
        machineNumber = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        partitionStandard = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.com.google.protobuf.ByteString]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DistributedProto.javaDescriptor.getMessageTypes().get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DistributedProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = distributed.distributed.PartitionResponse(
    machineNumber = 0,
    partitionStandard = _root_.scala.Seq.empty
  )
  implicit class PartitionResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, distributed.distributed.PartitionResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, distributed.distributed.PartitionResponse](_l) {
    def machineNumber: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.machineNumber)((c_, f_) => c_.copy(machineNumber = f_))
    def partitionStandard: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.com.google.protobuf.ByteString]] = field(_.partitionStandard)((c_, f_) => c_.copy(partitionStandard = f_))
  }
  final val MACHINENUMBER_FIELD_NUMBER = 1
  final val PARTITIONSTANDARD_FIELD_NUMBER = 2
  def of(
    machineNumber: _root_.scala.Int,
    partitionStandard: _root_.scala.Seq[_root_.com.google.protobuf.ByteString]
  ): _root_.distributed.distributed.PartitionResponse = _root_.distributed.distributed.PartitionResponse(
    machineNumber,
    partitionStandard
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[distributed.PartitionResponse])
}
