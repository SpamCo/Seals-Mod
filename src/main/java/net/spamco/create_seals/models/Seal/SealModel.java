// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class SealModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "seal"), "main");
	private final ModelPart Seal;

	public Seal(ModelPart root) {
		this.Seal = root.getChild("Seal");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Seal = partdefinition.addOrReplaceChild("Seal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Neck = Seal.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(0.0F, -5.079F, -11.095F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-5.0F, -6.0F, -4.0F, 10.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.9886F, -0.2615F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(36, 42).addBox(-5.0F, -6.0F, -2.25F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.5F, -2.0F, -6.25F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.421F, -4.655F));

		PartDefinition Body = Seal.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -16.0F, -15.0F, 15.0F, 13.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition L_Arm = Body.addOrReplaceChild("L_Arm", CubeListBuilder.create(), PartPose.offset(-7.0F, -4.0F, -12.0F));

		PartDefinition L_Arm_r1 = L_Arm.addOrReplaceChild("L_Arm_r1", CubeListBuilder.create().texOffs(59, 14).addBox(-7.0F, -1.0F, 0.0F, 7.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0785F, -0.0436F, -0.3927F));

		PartDefinition L_Wing = L_Arm.addOrReplaceChild("L_Wing", CubeListBuilder.create(), PartPose.offset(7.0F, 4.0F, 10.0F));

		PartDefinition L_Wing_r1 = L_Wing.addOrReplaceChild("L_Wing_r1", CubeListBuilder.create().texOffs(50, 62).addBox(-6.8F, 0.0F, -0.3F, 7.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, -2.0F, -11.0F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition R_Arm = Body.addOrReplaceChild("R_Arm", CubeListBuilder.create(), PartPose.offset(7.0F, -4.0F, -12.0F));

		PartDefinition R_Arm_r1 = R_Arm.addOrReplaceChild("R_Arm_r1", CubeListBuilder.create().texOffs(59, 0).addBox(0.0F, -1.0F, 0.0F, 7.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0785F, 0.0436F, 0.3927F));

		PartDefinition R_Wing = R_Arm.addOrReplaceChild("R_Wing", CubeListBuilder.create(), PartPose.offset(-7.0F, 4.0F, 10.0F));

		PartDefinition R_Wing_r1 = R_Wing.addOrReplaceChild("R_Wing_r1", CubeListBuilder.create().texOffs(23, 61).addBox(-0.2F, 0.0F, -0.3F, 7.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -2.0F, -11.0F, -0.0873F, 0.0F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Seal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}